package com.training.authentication;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.authentication.entity.User;
import com.training.authentication.entity.UserDto;

@Controller
public class AppController {
	@Autowired
	private ProductService service;

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);

		return "index";
	}

	@GetMapping("/new")
	public String showNewProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);

		return "new_product";
	}

	@PostMapping(value = "/save")
	public String saveProduct(@ModelAttribute("product") Product product) {
		service.save(product);

		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditProductForm(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_product");

		Product product = service.get(id);
		mav.addObject("product", product);

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") Long id) {
		service.delete(id);

		return "redirect:/";
	}

	@GetMapping("/user/registration")
	public String showRegistrationForm(Model model) {
		UserDto userDto = new UserDto();
		model.addAttribute("user", userDto);
		return "registration";
	}

	@PostMapping("/process_register")
	public String registerUserAccount(@ModelAttribute("user") @Valid UserDto userDto, BindingResult result,
			Model model) {

		if (result.hasErrors()) {
			return "registration";
		}

		if (!userDto.getPassword().equals(userDto.getMatchingPassword())) {
			model.addAttribute("message", "Passwords do not match.");
			return "registration";
		}

		try {
			User registered = userService.registerNewUserAccount(userDto);
		} catch (UserAlreadyExistException uaeEx) {
			model.addAttribute("message", "An account for this username/email already exists.");
			return "registration";
		}

		model.addAttribute("user", userDto);
		return "successRegister";
	}
}
