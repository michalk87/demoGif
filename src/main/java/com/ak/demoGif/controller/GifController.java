package com.ak.demoGif.controller;

import com.ak.demoGif.model.Gif;
import com.ak.demoGif.model.repository.GifRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {


    @RequestMapping("/showGifsBrowser")
    @ResponseBody
    public String showGifsBrowser(){

        return "gifs";


    }

}
