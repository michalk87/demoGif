package com.ak.demoGif.controller;

import com.ak.demoGif.model.Gif;
import com.ak.demoGif.model.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {


    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/showGifsBrowser")
    @ResponseBody
    public String showGifsBrowser(){

       return gifRepository.getGifNames();
    }

    @RequestMapping("/")
    @ResponseBody
    public String listGif(){

        // 1.Wyciąganie gifów
        List<Gif> gifList = gifRepository.getGifs();
     //   GifRepository gifRepository = new GifRepository();


        // 2. Przekazywanie gifa do view

        // 3. Zwracanie widoku

        return gifRepository.getGifs().toString();

    }





}
