package ex03_api;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MAIN2 {

    public static void main(String[] args) {

        String serviceKey = "HTH+GuFVSHV08Xp5UnBTYr9Z5H0xYtsU1LQXZe1XuqP1umWgGSUMlMc0JtnkzyAlxDQ8r5O2c2OiqtN2vxbYjA==";
        String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";

        URL url = null;
        HttpURLConnection con = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;


        try {
            StringBuilder sbURL = new StringBuilder(apiURL);

            sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
            sbURL.append("&returnType=json");
            sbURL.append("&stationName=" + URLEncoder.encode("종로구", "UTF-8"));
            sbURL.append("&dataTerm=DAILY");

            url = new URL(sbURL.toString());
            con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");

            if (con.getResponseCode() == 200) {
                reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {
                reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }

            String line = null;
            StringBuilder sb = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            reader.close();
            con.disconnect();

            JSONArray items = new JSONObject(sb.toString())
                    .getJSONObject("response")
                    .getJSONObject("body")
                    .getJSONArray("items");

            List<Map<String, Object>> list = new ArrayList<>();

            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                list.add(item.toMap());
                String dataTime = item.getString("dataTime");
                String coValue = item.getString("coValue");
//                String coGrade = item.getString("coGrade");
                String pm10Grade = item.getString("pm10Grade");

                System.out.println("측정일 : " + dataTime + " 일산화탄소농도 : " + coValue + " 일산화탄소지수 : "
                                    + " 미세먼지24시간등급 : " + pm10Grade);
                System.out.println();
            }


            File file = new File("/Users/woomin/Documents/storage","API테스트.json");

            writer = new BufferedWriter(new FileWriter(file));

            System.out.println(list);

            for(int i=0; i<list.size(); i++){
                writer.write(list.get(i).toString());
            }

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}










