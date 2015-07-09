package ttl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.liu.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,getData(),R.layout.main_item,new String[]{"img","title"},new int[]{R.id.img,R.id.text});
        ListView lv = (ListView)findViewById(R.id.mainlist);
      //  spinner1.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "你点击了确定按钮:-v90v-"+getData().get(position).get("title"), Toast.LENGTH_LONG ).show();
            }
        });
        lv.setAdapter(adapter);
    }


    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "第1期");
       // map.put("info", "电台DJ");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "第2期");
     //   map.put("info", "四大美女");
        list.add(map);

        map = new HashMap<String, Object>();
       map.put("img", R.drawable.ic_launcher);
        map.put("title", "第3期");
       //map.put("info", "清纯妹妹");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "第4期");
       // map.put("info", "是小狗");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "第5期");
       //map.put("info", "every thing");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "第6期");
       //map.put("info", "hello world");
        list.add(map);

        return list;
    }

}
