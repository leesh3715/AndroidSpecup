package com.example.user.myapplication;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/*
 * Created by leesh3715 on 2018-11-16.
 */
public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    // 구글 맵 참조변수 생성
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps1);

        // SupportMapFragment을 통해 레이아웃에 만든 fragment의 ID를 참조하고 구글맵을 호출한다.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this); // getMapAsync must be called on the main thread.
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // 구글 맵 객체를 불러온다.
        mMap = googleMap;

        LatLng center = new LatLng(37.538684, 126.979641);
        this.mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 12));
        // 구글 맵에 표시할 마커에 대한 옵션 설정]
        CustomInfoWindowAdapter adapter = new CustomInfoWindowAdapter(MapsActivity1.this);
        mMap.setInfoWindowAdapter(adapter);

        MarkerOptions makerOptions = new MarkerOptions();
       /* makerOptions
                .position(center)
                .title("공모전")
                .snippet("test");
        */ // 테스트용
        makerOptions.position(new LatLng(37.543407, 126.951539)) // 공덕역
                .title("ICT-문화 융합 아이디어 공모전")
                .snippet("위치: 서울특별시 마포구 공덕동 백범로 192\n" +
                        "기간: 18.10.08 ~ 18.12.28");
        mMap.addMarker(makerOptions).showInfoWindow();

        makerOptions.position(new LatLng(37.52487, 126.92723)) // 여의도1
                .title("불법 스포츠도박 근절 해커톤 대회")
                .snippet("위치: 서울특별시 영등포구 여의도동 국제금융로6길 38\n" +
                        "기간: 18.12.02 ~ 18.12.03" );
        mMap.addMarker(makerOptions).showInfoWindow();

        makerOptions.position(new LatLng(37.523182, 126.928524)) //  여의도2
                .title("국민은행 소프트웨어 경진대회")
                .snippet("위치: 서울특별시 영등포구 여의동 여의나루로 76\n" +
                        "기간: 18.10.1 ~ 18.12.23");
        mMap.addMarker(makerOptions).showInfoWindow();

        makerOptions.position(new LatLng(37.498291, 127.026441)) //  강남역1
                .title("식품안전정보 공공데이터 아이디어 공모전")
                .snippet("위치: 서울특별시 서초4동 KR 서울 서초구 서초동 1317-14\n" +
                        "기간: 18.9.17 ~ 18.11.30");
        mMap.addMarker(makerOptions).showInfoWindow();

        makerOptions.position(new LatLng(37.499992, 127.032011)) //  강남역2
                .title("한국지능로봇 경진대회")
                .snippet("위치: 서울특별시 강남구 역삼1동 648-8\n" +
                        "기간: 18.11.26 ~ 18.11.28");
        mMap.addMarker(makerOptions).showInfoWindow();

        makerOptions.position(new LatLng(37.501659, 127.026486)) //  강남역3
                .title("OCF KOREA 개발자 경진대회")
                .snippet("위치: 서울특별시 강남구 역삼동 814-6\n" +
                        "기간: 18.11.26 ~ 18.12.17");
        mMap.addMarker(makerOptions).showInfoWindow();

        makerOptions.position(new LatLng(37.511635, 127.059492)) //
                .title("VR, AR 그랜드 챌린지")
                .snippet("위치: 서울특별시 강남구 삼성동 영동대로 513\n" +
                        "기간: 18.9.30 ~ 18.11.30");
        mMap.addMarker(makerOptions).showInfoWindow();

        makerOptions.position(new LatLng(37.570753, 126.983483)) //
                .title("KSB 인공지능 프레임워크 공모전")
                .snippet("위치: 서울특별시 종로구 공평동 71-3\n" +
                        "기간: 18.10.4 ~ 18.11.30");
        mMap.addMarker(makerOptions).showInfoWindow();

        makerOptions.position(new LatLng(37.506610, 126.962176)) //
                .title("2018 KOSPO 정보전략실 모바일 서비스 공모전")
                .snippet("위치: 서울특별시 동작구 흑석동 95-1\n" +
                        "기간: 18.10.01 ~ 18.12.08");
        mMap.addMarker(makerOptions).showInfoWindow();

        makerOptions.position(new LatLng(37.547518, 127.041610)) //
                .title("Link-on-Award")
                .snippet("위치: 서울특별시 성동구 성수동1가 685-258\n" +
                        "기간: 18.9.30 ~ 18.11.30");
        mMap.addMarker(makerOptions).showInfoWindow();

        makerOptions.position(new LatLng(37.538684, 126.979641)) //
                .title("공개 SW GRAND CHALLENGE")
                .snippet("위치: 서울특별시 용산구 용산동1가 36-1\n" +
                        "기간: 18.12.08(토) 13:00");
        mMap.addMarker(makerOptions).showInfoWindow();
        //카메라를 center 위치로 옮긴다.
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center));
    }
}
//37.543407, 126.951539(공덕역)
//37.523182, 126.928524(여의도2)
//37.498291, 127.026441(강남역1)
//37.499992, 127.032011(강남역2)
//37.501659, 127.026486(강남역3)
//37.511635, 127.059492(코엑스1)
//37.570753, 126.983483(종로)
//37.527911, 126.967379(용산역)
// 위,경도 임의값 책정
