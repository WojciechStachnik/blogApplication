package com.stachnik.wojciech.blogApplication.mainController;

import com.stachnik.wojciech.blogApplication.model.Post;
import com.stachnik.wojciech.blogApplication.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    IPostRepository iPostRepository;

    @GetMapping("/")
    public String getIndexPage(Model model){
        model.addAttribute("name", "Wojciech");
        return "index";
    }

    @GetMapping("/addPost")
    public String addPostPage(){
        return "addPost";
    }

    @PostMapping("/addPost")
    public String addPost(@RequestParam (value = "title") String title, @RequestParam (value = "content")String content){
        Post post = new Post(title, content);
        iPostRepository.save(post);
        System.out.println("Paramiters: " + title + "second: " + content);
        return "index";
    }


}
