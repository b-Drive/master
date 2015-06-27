$(document).ready(function(){


// 今日の日付で Date オブジェクトを作成
var now = new Date();

// 「年」「月」「日」「曜日」を Date オブジェクトから取り出してそれぞれに代入
var y = now.getFullYear();
var m = now.getMonth() + 1;
var d = now.getDate();
var w = now.getDay();
var h = now.getHours();
var mi = now.getMinutes();

$('#MF_form_phrase02').val(y + '年' + m + '月' + d + '日' + h + ':' + mi);

});


function clickRECO(memId,recTime,recMode){

	alert(memId+recTime+recMode);
	
	$.ajax({
	   type: "POST",
	   url: "some.php",
	   data: {
	     id: memId,
         time: recTime,
         mode:recMode
	   },
	   success: function(){
	     alert( "登録完了しました");
	   }
	 });
}
