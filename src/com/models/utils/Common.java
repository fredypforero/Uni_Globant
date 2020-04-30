package com.models.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public Common() {
    }

    public List<String> readFile(String filename) {
        String path = "C:/Users/fredy.pena/IdeaProjects/UniGlobant/src/com/resourses/";
        ArrayList lines = new ArrayList();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path + filename));

            String line;
            while((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException var6) {
            var6.printStackTrace();
        } catch (IOException var7) {
            var7.printStackTrace();
        }

        return lines;
    }

}
