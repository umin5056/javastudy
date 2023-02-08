package api;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class ApiMain {
    public static void main(String[] args) {

        String serviceKey = "HTH+GuFVSHV08Xp5UnBTYr9Z5H0xYtsU1LQXZe1XuqP1umWgGSUMlMc0JtnkzyAlxDQ8r5O2c2OiqtN2vxbYjA==";
        String apiURl = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
        URL url = null;
        HttpURLConnection con = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {

            StringBuilder sbURL = new StringBuilder(apiURl);

            sbURL.append("?ServiceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
            sbURL.append("&searchYear=2021");
            sbURL.append("&siDo=1100");
            sbURL.append("&guGun=1125");
            sbURL.append("&type=json");
            sbURL.append("&numOfRows=10");
            sbURL.append("&pageNo=1");

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
            writer = new BufferedWriter(new FileWriter("/Users/woomin/Documents/storage/accident.txt"));

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            reader.close();
            con.disconnect();

            writer.write(sb.toString());

            writer.close();

            JSONArray items = new JSONObject(sb.toString())
                    .getJSONObject("items")
                    .getJSONArray("item");

            String[] dayName = {"", "일","월","화","수","목","금","토"};
            List<JSONObject> list = new ArrayList<>();

            for (int i = 0; i < items.length(); i++) {
                JSONObject obj = items.getJSONObject(i);

                String occrrnc_dt = obj.getString("occrrnc_dt");
                String occrrnc_day_cd = obj.getString("occrrnc_day_cd");
                Integer dth_dnv_cnt = obj.getInt("dth_dnv_cnt");
                Integer injpsn_cnt = obj.getInt("injpsn_cnt");

                Accident acc = new Accident();
                acc.setOccrrncDt(occrrnc_dt);
                acc.setOccrrncDayCd(dayName[Integer.parseInt(occrrnc_day_cd)] + "요일");
                acc.setDthDnvCnt(dth_dnv_cnt);
                acc.setInjpsnCnt(injpsn_cnt);

                list.add(obj);
            }

            System.out.println(list);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}








