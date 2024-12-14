package utils;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class jasonutills {

    // Method to read the JSON file
    public static JSONObject readJSONFile(String filePath) {
        InputStream is = null;
        try {
            is = new FileInputStream(filePath);  // Open file stream
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // If the InputStream is null, return an empty JSONObject
        if (is == null) {
            return new JSONObject();
        }

        // Parse the JSON file and return JSONObject
        JSONTokener tok = new JSONTokener(is);
        return new JSONObject(tok);
    }




}
