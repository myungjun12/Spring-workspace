/**
 * 순수 자바스크립트 형식과 jquery 형식
 */

/*
	<button onclick="btn()">연결테스트</button>
	를 클릭했을 때 나오는 기능
*/ 
function btn(){
	alert("클릭되었습니다.");
}

/*
	<button id="btn">연결테스트</button>
	를 클릭했을 때 나오는 기능 
*/ 
document.querySelector("#btn").addEventListener("click",btn);

/*
	<button id="btn">연결테스트</button>
	를 제이쿼리 형식으로 변경하기

$(document).ready(function(){
	$("#btn").click(function(){
		alert("버튼입니다.");
	});
})
*/
