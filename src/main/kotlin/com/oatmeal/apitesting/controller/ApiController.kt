package com.oatmeal.apitesting.controller

import com.oatmeal.apitesting.service.dto.ApiDataDto
import lombok.RequiredArgsConstructor
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@RequiredArgsConstructor
@Controller
class ApiController {
    @GetMapping("/")
    fun showMainPagePage(model: Model): String {
        var testList: List<ApiDataDto> = listOf(
            ApiDataDto("1", "GET", "https://jsonplaceholder.typicode.com/posts", "json", "JSON"),
            ApiDataDto("2", "PUT", "http://ucs.dev", "json", "JSON"),
        )
        model.addAttribute("apidatas", testList)
        return "main-page"
    }
}