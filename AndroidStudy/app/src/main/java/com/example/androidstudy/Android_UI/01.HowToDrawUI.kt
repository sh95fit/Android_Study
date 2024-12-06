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
