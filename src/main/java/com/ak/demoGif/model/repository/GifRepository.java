package com.ak.demoGif.model.repository;

import com.ak.demoGif.model.Gif;

import java.util.Arrays;
import java.util.List;

public class GifRepository {


    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosions", "mols",true),
            new Gif("ben-and-mike", "mika",true),
            new Gif("book-dominos", "mem",true),
            new Gif("compiler-bot", "bot",true),
            new Gif("cowboy-coder", "code",true),
            new Gif("infinite-andrew", "andrew",true)

    );


}