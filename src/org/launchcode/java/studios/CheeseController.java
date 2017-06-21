/*<!DOCTYPE html>
<html lang="en" xmlns:th="http://thymeleaf.org/">
<head th:replace="fragments :: head"></head>
<body>
<h1 th:text="${title}">Default Title</h1>

<nav th:replace="fragments :: navigation"></nav>

<p th:unless="${cheeses} and ${cheeses.size()}">no cheese :(</p>

<form method="POST" th:if="${cheeses} and ${cheeses.size()}">
<table>
<tr th:each ="cheese : ${cheeses}"><td th:text="${cheese.key}"></td><td th:text="${cheese.value}"></td><td><input type="checkbox" name="cheese" th:value="${cheese.key}">Delete?</input></td></tr>
</table>
<input type="submit" value="Remove cheeses" />
</form>
</body>
</html>

        package org.launchcode.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;

        import java.util.ArrayList;
        import java.util.HashMap;

/**
 * Created by LaunchCode
 */
/*
@Controller
@RequestMapping(value = "cheese")
public class CheeseController {

    static HashMap<String, String> cheeses = new HashMap<String, String>();

    // Request path: cheese/
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheeses");
        return "cheese/index";
    }

    // Request path: cheese/add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model) {

        model.addAttribute("title", "Add Cheese");
        return "cheese/add";
    }

    // Request path: cheese/add
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@RequestParam String cheeseName, String cheeseDescription) {

        cheeses.put(cheeseName, cheeseDescription);

        // Redirect to cheese/
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String remove(Model model) {

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "Remove Cheese");
        return "cheese/remove";
    }

    // Request path: cheese/add
    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCheeseForm(@RequestParam ArrayList<String> cheese) {

        for(String c : cheese) {
            cheeses.remove(c);
        }

        // Redirect to cheese/
        return "redirect:";
    }
}*/