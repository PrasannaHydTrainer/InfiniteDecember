	function show() {
		var result="";
		if (frmAttendance.chkChandu.checked==true) {
			result+="Chandu is Present Today...<br/>";
		} else {
			result+="Chandu is Absent Today...<br/>";
		}
		if (frmAttendance.chkPavan.checked==true) {
			result+="Pavan is Present Today...<br/>";
		} else {
			result+="Pavan is Absent Today...<br/>";
		}
		if (frmAttendance.chkAkhila.checked==true) {
			result+="Akhila is Present Today...<br/>";
		} else {
			result+="Akhila is Absent Today...<br/>";
		}
		document.getElementById("result").innerHTML=result;
	}
