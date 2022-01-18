package terceiroDesafio;


import com.google.gson.Gson;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class DadosJson {

    public List<Faturamento> lista(){
        String json = null;
        try {
            json = String.join(" ",
                    Files.readAllLines(
                            Paths.get("./dados.json"),
                            StandardCharsets.UTF_8)
                    );
            Config config = new Gson().fromJson(json, Config.class);

            List<Faturamento> fat = config.getMes();

            return fat;


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
