package com.example.androidstudy.Android_UI

// 안드로이드에서 화면을 그리는 방법
// - XML을 이용한 UI 그리기
//  * XML이란?
//    - DSL Language (Domain Specific Language)
//    - 안드로이드 UI를 그리는 데에 특화된 언어

// 화면 크기가 다양한 기기에 최적화된 화면을 그리는 방법
// - 픽셀, dpi, dp 단위
//   - 픽셀 : 가장 작은 단위 (해상도가 좋다 == 정해진 범위 내 많은 픽셀이 포함)
//   - dpi : dot per inch (1인치 내에 도트가 얼마나 많이 있는가를 나타내는 단위)
//     > ldpi -> 120 (1인치에 120픽셀)
//     > mdpi -> 160
//     > hdpi -> 240
//     > xhdpi -> 320
//     > xxdpi -> 480
//     > xxhdpi -> 640
//   - dp -> Density Independent Pixel
//     > 독립적인 단위로 해당 단위로 설정되면 모든 기기에서 동일하게 표시
//     > 즉, UI를 그릴 때 픽셀 단위가 아닌 dp 단위로 그려야 한다!


// XML
// 부모와 자식 관계를 갖는다
// 부모 컴포넌트가 될 수 있는 항목
// Layouts 내에 있는 대부분의 항목이 부모 컴포넌트가 될 수 있다.
// 자식 컴포넌트로만 사용 가능한 항목
// 배치에 영향을 주지 않고 시각적인 요소로 표시되는 컴포넌트들이 이에 해당한다.
// layout_width, layout_height는 모든 컴포넌트에 필수로 적용되어야 하는 속성이다.
// - match_parent : 부모의 폭, 높이만큼 적용
// - wrap_content : 컴포넌트를 감쌀 수 있는 폭, 높이만큼 적용

// LinearLayout
// android:orientation : 자식 요소를 수직(Vertical)/수평(Horizontal)로 배치하는 속성
// android:gravity : 부모 컴포넌트에서 지정 시 포함된 모든 자식 요소의 배치에 영향을 준다 (일괄 지정)

// TextView
// android:layout_gravity : 레이아웃(LinearLayout)을 부모 요소로 갖고 있을 때 활용 가능 (center/left/right ...)
//                          부모 요소에서 gravity가 지정되어 있더라도 자식 요소에서 지정된 것을 우선 순위 상위로 적용한다!
//                          (작은 범위의 속성을 우선 적용하는 안드로이드 특성)

// ImageView
// android:background : "#RRGGBB" 컬러 코드로 적용 가능 / 또는 @color 로 적용 가능

// layout_gravity vs gravity
// layout_gravity : 부모 컴포넌트를 기준으로 어디로 위치 시킬지 정의
// gravity : 해당 컴포넌트 내에서 위치 정의

// Relativelayout
