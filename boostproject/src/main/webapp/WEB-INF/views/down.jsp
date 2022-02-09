<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메타데이터</title>
    <link href="/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

    <style>
        body{
            font-size: small;
            color: rgb(54, 54, 58);
        }
        table,tr,th,td{         
            padding:8px;           
        }
    </style>
</head>
<body>
    <table class="table table-bordered">
        <tr>
            <th>Data</th><th colspan="2">내용</th>
        </tr>
        <!-- 관광객 수 -->
        
        <tr>
						 <td> <input type="button" value="엑셀다운" onclick="download(giyub.xlsx);"/> </td>
						
        </tr>        
        
    </table>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/xlsx/0.15.5/xlsx.full.min.js"></script>
    <script>
    function _excelDown(fileName, sheetName, sheetHtml) { 
    	var html = '';
    	html += '<html xmlns:x="urn:schemas-microsoft-com:office:excel">';
    	html += ' <head>';
    	html += ' <meta http-equiv="content-type" content="application/vnd.ms-excel; charset=UTF-8">';
    	html += ' <xml>';
    	html += ' <x:ExcelWorkbook>';
    	html += ' <x:ExcelWorksheets>';
    	html += ' <x:ExcelWorksheet>' html += ' <x:Name>' + sheetName + '</x:Name>'; // 시트이름 
    	html += ' <x:WorksheetOptions><x:Panes></x:Panes></x:WorksheetOptions>';
    	html += ' </x:ExcelWorksheet>';
    	html += ' </x:ExcelWorksheets>';
    	html += ' </x:ExcelWorkbook>';
    	html += ' </xml>';
    	html += ' </head>';
    	html += ' <body>';
    	// ----------------- 시트 내용 부분 ----------------- 
    	html += sheetHtml;
    	// ----------------- //시트 내용 부분 ----------------- 
    	html += ' </body>';
    	html += '</html>';
    	// 데이터 타입
    	var data_type = 'data:application/vnd.ms-excel';
    	var ua = window.navigator.userAgent;
    	var blob = new Blob([html], {type: "application/csv;charset=utf-8;"});
    	
    	if ((ua.indexOf("MSIE ") > 0 || !!navigator.userAgent.match(/Trident.*rv\:11\./)) && window.navigator.msSaveBlob) { 
    		// ie이고 msSaveBlob 기능을 지원하는 경우
    		navigator.msSaveBlob(blob, fileName); 
    		} else { 
    			// ie가 아닌 경우 (바로 다운이 되지 않기 때문에 클릭 버튼을 만들어 클릭을 임의로 수행하도록 처리)
    			var anchor = window.document.createElement('a');
    			anchor.href = window.URL.createObjectURL(blob);
    			anchor.download = fileName;
    			document.body.appendChild(anchor);
    			anchor.click(); 
    			
    			// 클릭(다운) 후 요소 제거 
    			document.body.removeChild(anchor);
    			}
    	}
    
    function download(){ 
    	// 대상 테이블을 가져옴
    	var table = document.getElementById("table01");
    	if(table){ 
    		// CASE 대상 테이블이 존재하는 경우 
    		// 엑셀다운 (엑셀파일명, 시트명, 내부데이터HTML)
    		_excelDown("giyub.xlsx", "시트명", down) 
    		} 
    	}
    </script>
</body>
</html>