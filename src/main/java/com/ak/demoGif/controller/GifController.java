package com.ak.demoGif.controller;

import com.ak.demoGif.model.Gif;
import com.ak.demoGif.model.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    public String listGif(ModelMap modelMap){

        // 1.Wyciąganie gifów
        List<Gif> gifList = gifRepository.getGifs();


        // 2. Przekazywanie gifa do view
        modelMap.put("gifs", gifList);


        // 3. Zwracanie widoku
        return "home";
    }

    // przycisk na stronie Ulubione - favourite:
    @RequestMapping("/favorites")
    public String gifFavorites(ModelMap modelMap){
        // Według schematu:
        List<Gif> favoriteGifs = gifRepository.getFavoritesGifs();
        // Analogicznie: 1. Pobieramy listę gifów (tylko ulubionych)
        // 2. Przekazywanie gifów do widoku
        modelMap.put("gifs", favoriteGifs);
        // Informacja: widok nazywa sie favourite.html


        return "favorites";

    }







}
