/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import models.Game;
import models.EnglishGame;
import models.SpanishGame;
import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;


@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html();
    }

    public Result start() {
        return Results.html().template("views/AcesUp/AcesUpStartScreen.html");
    }

    public Result engAcesUp() {
        return Results.html().template("views/AcesUp/EngAcesUp.flt.html");
    }

    public Result spanAcesUp() {
        return Results.html().template("views/AcesUp/SpanAcesUp.html");
    }
    
    public Result englishGameGet(){
        EnglishGame g = new EnglishGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();
        g.error = false;

        return Results.json().render(g);
    }

    public Result spanishGameGet(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();
        g.error = false;

        return Results.json().render(g);
    }

    public Result dealPost(Context context, EnglishGame g) {
        if(context.getRequestPath().contains("deal")){
            g.dealFour();
        }
        g.error = false;
        return Results.json().render(g);
    }

    public Result dealSpanPost(Context context, SpanishGame g) {
        if(context.getRequestPath().contains("deal")){
            g.dealFour();
        }
        g.error = false;
        return Results.json().render(g);
    }

    public Result removeCard(Context context, @PathParam("column") int colNumber, EnglishGame g){
        g.remove(colNumber);
        return Results.json().render(g);
    }

    public Result moveCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, EnglishGame g){
        g.move(colFrom,colTo);
        g.error = false;
        return  Results.json().render(g);
    }

    public Result removeSpanCard(Context context, @PathParam("column") int colNumber, SpanishGame g){
        g.remove(colNumber);
        return Results.json().render(g);
    }

    public Result moveSpanCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, SpanishGame g){
        g.move(colFrom,colTo);
        g.error = false;
        return  Results.json().render(g);
    }

}
