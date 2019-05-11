package com.ak.demoGif.model.repository;

import com.ak.demoGif.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepository {


    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosions", "mols",true),
            new Gif("ben-and-mike", "mika",true),
            new Gif("book-dominos", "mem",true),
            new Gif("compiler-bot", "bot",true),
            new Gif("cowboy-coder", "code",true),
            new Gif("infinite-andrew", "andrew",true)

    );

    public List<Gif> getGifs(){
        return ALL_GIFS;
    }

    public String getGifNames(){
        String result = "";
        for (Gif allGif : ALL_GIFS){
            result += allGif.getName();

        }
           return  result;
    }


   /*
    public void printGifs (Gif List){

        for (Gif Gifs: ALL_GIFS ) {
            System.out.println(Gifs);

        }
    }
*/
}
