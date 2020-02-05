package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        BufferedReader fr = new BufferedReader(new FileReader(fileName));

        StringBuilder sb = new StringBuilder();
        while (fr.ready()) sb.append(fr.readLine());
        fr.close();

        Document html = Jsoup.parse(sb.toString(), "", Parser.xmlParser());
        Elements elem = html.getElementsByTag(args[0]);
        for (Element element : elem) System.out.println(element.toString());
    }
}
