var tab = null;
var accordion = null;
var tree = null;
var mediaId = null;
$(function() {

	//布局
	$("#layout1").ligerLayout({
		leftWidth : 190,
		height : '100%',
		heightDiff : -34,
		space : 4,
		onHeightChanged : f_heightChanged
	});

	var height = $(".l-layout-center").height();

	//Tab
	$("#framecenter").ligerTab({
		height : height
	});

	//面板
	$("#accordion1").ligerAccordion({
		height : height - 24,
		speed : null
	});

	$(".l-link").hover(function() {
		$(this).addClass("l-link-over");
	}, function() {
		$(this).removeClass("l-link-over");
	});
	//树
	$("#tree1").ligerTree({
		url : 'mvc/menubar/getmenu',
		checkbox : false,
		slide : false,
		nodeWidth : 120,
		attribute : [ 'nodename', 'url' ],
		onSelect : function(node) {
			if (!node.data.url)
				return;
			var tabid = $(node.target).attr("tabid");
			if (!tabid) {
				tabid = new Date().getTime();
				$(node.target).attr("tabid", tabid)
			}
			f_addTab(tabid, node.data.text, node.data.url);
			$(".pitchon",$("#accordion1")).removeClass("pitchon");
			$(".l-selected",$("#accordion1")).removeClass("l-selected").addClass("pitchon");;
		}
	});

	tab = $("#framecenter").ligerGetTabManager();
	accordion = $("#accordion1").ligerGetAccordionManager();
	tree = $("#tree1").ligerGetTreeManager();
	$("#pageloading").hide();

});
function f_heightChanged(options) {
	if (tab)
		tab.addHeight(options.diff);
	if (accordion && options.middleHeight - 24 > 0)
		accordion.setHeight(options.middleHeight - 24);
}
function f_addTab(tabid, text, url) {
	tab.addTabItem({
		tabid : tabid,
		text : text,
		url : url
	});
}

//$(function(){
//	var p = $('body').layout('panel','west').panel();
//	setTimeout(function(){
//		$('body').layout('collapse','east');
//	},0);
//	
//	$('#tt').tree({
//		checkbox: false,
//		url: 'mvc/menubar/get',
//		onClick:function(node){
//			$(this).tree('toggle', node.target);
//			if($(node.text).attr("hh")==null || $.trim($(node.text).attr("hh"))=="")return;
//			var has = false;
//			$("ul.tabs").find('.tabs-title').each(function(i,o){
//				if ($(this).text() == $(node.text).text()) {
//					has = true;
//				}
//			});
//			if (!has) {
//				$('#tabs').tabs('add', {
//					title: node.text,
//					content:'<iframe height="483" width="100%" frameborder="0" scrolling="auto" allowtransparency="true" src="'+$(node.text).attr("hh")+'"></iframe>',
//					closable: true,
//					selected: true
//				});
//			}else{
//				$('#tabs').tabs("select",node.text);
//			}
//		},
//		onLoadSuccess:function(node,data){
//			$("#loading").remove();
//		}
//	});
//	
//	
//});