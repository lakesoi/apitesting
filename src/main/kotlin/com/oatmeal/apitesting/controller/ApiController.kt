package com.oatmeal.apitesting.controller

import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@RequiredArgsConstructor
@Controller
class ApiController {
    @GetMapping("/")
    fun showMainPagePage(model: Model): String {
        model.addAttribute("apis", "ffff")
        return "main-page"
    }
}