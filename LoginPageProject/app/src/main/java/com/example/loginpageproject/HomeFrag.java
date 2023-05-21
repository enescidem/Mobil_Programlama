package com.example.loginpageproject;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFrag extends Fragment {

    private RecyclerView benimrecyc;
    private ArrayList<Bayram> bayrams;
    private MyrecycAdaptor myadaptor;
    /*
    ListView listem;
    private ArrayAdapter<String> adapter;
    private String [] bayramlar={
            "19 Mayıs Atatürk'ü Anma, Gençlik ve Spor Bayramı",
            "23 Nisan Ulusal Egemenlik ve Çocuk Bayramı",
            "30 Ağustos Zafer Bayramı",
            "29 Ekim Cumhuriyet Bayramı"};
    private String [] bayramAciklama={
            "Bu bayram, Türkiye Cumhuriyeti'nin kurucusu ve ilk Cumhurbaşkanı Mustafa Kemal Atatürk'ün Samsun'a çıkarak Kurtuluş Savaşı'nı başlatması anısına kutlanır. Gençlik ve Spor Bayramı olarak da anılan bu gün, gençlerin Atatürk'ün ilke ve devrimlerine sahip çıkmalarını, spor ve kültürel etkinliklerle bir araya gelmelerini teşvik eder. 19 Mayıs, Türk gençliğinin vatanına, bayrağına ve değerlerine olan bağlılığını vurgular, milli birlik ve beraberlik duygularını pekiştirir. Atatürk'ü Anma, Gençlik ve Spor Bayramı, Türkiye'nin genç nesillerini daha aydınlık, ileriye yönelik ve Atatürkçü düşüncelerle donatmak amacıyla kutlanır.",
            "Bu bayram, Türkiye Büyük Millet Meclisi'nin açıldığı ve ulusal egemenliğin ilan edildiği tarihi anma amacını taşır. Aynı zamanda çocukların sevgi, saygı ve özgürlüklerini vurgular. 23 Nisan, Türk çocuklarına özel etkinlikler, kutlamalar ve gösterilerle dolu bir gün olarak kutlanır. Bu bayram, çocukların düşünce, ifade ve katılım haklarını destekleyerek onların geleceğe güvenle ilerlemelerini sağlar. Ulusal Egemenlik ve Çocuk Bayramı, Türkiye'nin geleceği olan çocuklara değer verildiğini gösterir ve onların mutluluğunu, sevincini ve umutlarını ön plana çıkarır.",
            "Bu bayram, Türk milletinin Kurtuluş Savaşı'ndaki büyük zaferini anmak ve şehitleri anmak amacıyla düzenlenir. 30 Ağustos, Türk milletinin bağımsızlık mücadelesindeki en önemli dönüm noktalarından biri olan Başkomutanlık Meydan Muharebesi'nin zaferiyle sonuçlanan bir günü temsil eder. Bu bayram, Türk milletinin birlik ve beraberlik ruhunu pekiştirir, vatan sevgisini ve milli değerlere olan bağlılığı yüceltir. Zafer Bayramı, Türkiye'nin bağımsızlık ve özgürlük mücadelesinde elde edilen zaferleri kutlayarak milli gurur ve onur duygularını canlı tutar. 30 Ağustos, Türk milletinin direniş, cesaret ve kararlılıkla tarih sahnesindeki yerini güçlü bir şekilde korumasını simgeler.",
            "Bu bayram, Türkiye Cumhuriyeti'nin ilan edildiği tarihi anma amacını taşır. 29 Ekim 1923, Türk milletinin bağımsızlık mücadelesini zaferle sonuçlandıran ve modern Türkiye'nin temellerini atan bir günü simgeler. Cumhuriyet Bayramı, Türk milletinin demokrasi, laiklik, eşitlik ve özgürlük ilkeleriyle yönetildiği cumhuriyet rejimine olan inancını ve bağlılığını vurgular. Bu bayram, Atatürk'ün önderliğinde gerçekleşen devrimlerin ve Türkiye'nin modernleşme sürecinin bir kutlamasıdır. Cumhuriyet Bayramı, Türkiye'nin çağdaş bir ulus olarak ilerleme ve kalkınma hedeflerine olan inancını yansıtır ve milli birlik ve beraberlik duygularını pekiştirir."};
    private int[] bayramresim={R.drawable.bayram1,R.drawable.bayram2,R.drawable.bayram3,R.drawable.bayram4};
    private Bitmap secbayram;
    */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        benimrecyc=view.findViewById(R.id.myrecyc);
        bayrams=new ArrayList<>();
        myadaptor=new MyrecycAdaptor(bayrams);
        benimrecyc.setAdapter(myadaptor);
        benimrecyc.setLayoutManager(new LinearLayoutManager(this.getActivity()));//dikkat
        diziolustur();
        myadaptor.notifyDataSetChanged();
        return view;

    }

    private void diziolustur() {
        bayrams.add(new Bayram(R.drawable.bayram1,"19 Mayıs Atatürk'ü Anma, Gençlik ve Spor Bayramı","Bu bayram, Türkiye Cumhuriyeti'nin kurucusu ve ilk Cumhurbaşkanı Mustafa Kemal Atatürk'ün Samsun'a çıkarak Kurtuluş Savaşı'nı başlatması anısına kutlanır. Gençlik ve Spor Bayramı olarak da anılan bu gün, gençlerin Atatürk'ün ilke ve devrimlerine sahip çıkmalarını, spor ve kültürel etkinliklerle bir araya gelmelerini teşvik eder. 19 Mayıs, Türk gençliğinin vatanına, bayrağına ve değerlerine olan bağlılığını vurgular, milli birlik ve beraberlik duygularını pekiştirir. Atatürk'ü Anma, Gençlik ve Spor Bayramı, Türkiye'nin genç nesillerini daha aydınlık, ileriye yönelik ve Atatürkçü düşüncelerle donatmak amacıyla kutlanır."));
        bayrams.add(new Bayram(R.drawable.bayram2,"23 Nisan Ulusal Egemenlik ve Çocuk Bayramı","Bu bayram, Türkiye Büyük Millet Meclisi'nin açıldığı ve ulusal egemenliğin ilan edildiği tarihi anma amacını taşır. Aynı zamanda çocukların sevgi, saygı ve özgürlüklerini vurgular. 23 Nisan, Türk çocuklarına özel etkinlikler, kutlamalar ve gösterilerle dolu bir gün olarak kutlanır. Bu bayram, çocukların düşünce, ifade ve katılım haklarını destekleyerek onların geleceğe güvenle ilerlemelerini sağlar. Ulusal Egemenlik ve Çocuk Bayramı, Türkiye'nin geleceği olan çocuklara değer verildiğini gösterir ve onların mutluluğunu, sevincini ve umutlarını ön plana çıkarır."));
        bayrams.add(new Bayram(R.drawable.bayram3,"30 Ağustos Zafer Bayramı","Bu bayram, Türk milletinin Kurtuluş Savaşı'ndaki büyük zaferini anmak ve şehitleri anmak amacıyla düzenlenir. 30 Ağustos, Türk milletinin bağımsızlık mücadelesindeki en önemli dönüm noktalarından biri olan Başkomutanlık Meydan Muharebesi'nin zaferiyle sonuçlanan bir günü temsil eder. Bu bayram, Türk milletinin birlik ve beraberlik ruhunu pekiştirir, vatan sevgisini ve milli değerlere olan bağlılığı yüceltir. Zafer Bayramı, Türkiye'nin bağımsızlık ve özgürlük mücadelesinde elde edilen zaferleri kutlayarak milli gurur ve onur duygularını canlı tutar. 30 Ağustos, Türk milletinin direniş, cesaret ve kararlılıkla tarih sahnesindeki yerini güçlü bir şekilde korumasını simgeler."));
        bayrams.add(new Bayram(R.drawable.bayram4,"29 Ekim Cumhuriyet Bayramı","Bu bayram, Türkiye Cumhuriyeti'nin ilan edildiği tarihi anma amacını taşır. 29 Ekim 1923, Türk milletinin bağımsızlık mücadelesini zaferle sonuçlandıran ve modern Türkiye'nin temellerini atan bir günü simgeler. Cumhuriyet Bayramı, Türk milletinin demokrasi, laiklik, eşitlik ve özgürlük ilkeleriyle yönetildiği cumhuriyet rejimine olan inancını ve bağlılığını vurgular. Bu bayram, Atatürk'ün önderliğinde gerçekleşen devrimlerin ve Türkiye'nin modernleşme sürecinin bir kutlamasıdır. Cumhuriyet Bayramı, Türkiye'nin çağdaş bir ulus olarak ilerleme ve kalkınma hedeflerine olan inancını yansıtır ve milli birlik ve beraberlik duygularını pekiştirir."));
    }
}