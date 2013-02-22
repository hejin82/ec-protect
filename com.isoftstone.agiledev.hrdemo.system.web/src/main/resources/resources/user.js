$(function(){
	grid = $("#usergrid").ligerGrid({
		columns : [ 
		            {width :'10%',display : '用户编号',name : 'appName'},
		            {width :'10%',display : '注册名',name : 'appVersion'},
		            {width :'10%',display : '密码',name : 'statisticsDate'},
		            {width :'10%',display : '用户姓名',name : 'downloadCount'},
		            {width :'15%',display : '邮编',name : 'downloadCount'},
		            {width :'15%',display : '地址',name : 'downloadCount'},
		            {width :'15%',display : '联系电话',name : 'downloadCount'},
		            {width :'15%',display : '邮箱地址',name : 'downloadCount'}],
			checkbox : true,
			rownumbers : true,
			pageSizeOptions:[10,20],
			rowHeight: 22,                           
		    headerRowHeight: 22,                    
			url : "download",
			toolbar : { items: [{id:'currBtn', text: '当前数据报表', click: currentChart, icon: 'chart' },
				               { line: true },
				               {id:'trendBtn', text: '日趋势图', click: downloadTrend, icon: 'trend' },
			                   { line: true },
			                   { id:'analysisBtn', text: '对比分析', click: compareAnalysis, icon: 'analysis' },
			                   { line: true }
			                   ]
						},
//			onDblClickRow:downloadTrend,
			onSelectRow:selectHandle,
            onUnSelectRow:selectHandle,
            onReload:function(){initGrid();},
	});


});