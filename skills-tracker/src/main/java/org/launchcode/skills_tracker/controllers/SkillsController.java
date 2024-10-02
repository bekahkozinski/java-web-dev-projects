package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String languages(){
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker<h1>" +
                        "<h2>Languages We'd Like to Learn<h2>" +
                            "<ol>" +
                            "<li>Java" +
                            "<li>JavaScript" +
                            "<li>HTML" +
                        "</ol>" +
                        "<p>Click <a href='/form'>here</a> to select your Top 3!</p>" +
                        "</body>" +
                        "</html>";
        return html;
    }
    @GetMapping("name")
    public String getName(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/form")
        public String form () {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Rank Your Top 3 Programming Languages<h1>" +
                        "<form action='/form' method='POST'>" +
                        "<label>Name:</label>" +
                        "<input type='text' name='coder' /><br />" +
                        "<label>My favorite language: </label>" +
                            "<select name='firstLanguage'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='HTML'>HTML</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                            "</select><br />" +
                            "<label>My 2nd favorite language: </label>" +
                                "<select name='secondLanguage'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='HTML'>HTML</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                "</select><br />" +
                            "<label>My 3rd favorite language: </label>" +
                                    "<select name='thirdLanguage'>" +
                                        "<option value='Java'>Java</option>" +
                                        "<option value='HTML'>HTML</option>" +
                                        "<option value='JavaScript'>JavaScript</option>" +
                        "</select>" +
                        "<input type='submit' value='Submit'>" +
                        "</body>" +
                        "</html>";
        return html;
        }

        @PostMapping("/form")
        public String finalForm(String coder, String firstLanguage, String secondLanguage, String thirdLanguage) {
            String html =
                    "<html>" +
                            "<body>" +
                            "<h1>" + coder + "</h1>" +
                            "<h2> Your Top 3 Coding Languages </h2>" +
                            "<h3>1st Place: " + firstLanguage + "</h3>" +
                            "<h3>2nd Place: " + secondLanguage + "</h3>" +
                            "<h3>3rd Place: " + thirdLanguage + "</h3>";
                    return html;
        }


}
