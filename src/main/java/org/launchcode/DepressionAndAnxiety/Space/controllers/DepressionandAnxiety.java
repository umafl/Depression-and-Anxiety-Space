package org.launchcode.DepressionAndAnxiety.Space.controllers;

import org.launchcode.DepressionAndAnxiety.Space.models.data.DepanxDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("")
public class DepressionandAnxiety {

    @Autowired
    private DepanxDao depanxDao;

    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request) {
        /* I need to put "name" in the parenthesis below */
        String name = request.getParameter("name");
        if (name == null) {
            name = "World!";
        }
        return "Hello " + name;
    }
}
