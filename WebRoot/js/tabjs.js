function loadTab(){
	$("ul.tab_label li:first-child").addClass("current");
    $("div.tab_content").find("div.layout:not(:first-child)").hide();
    $("div.tab_content div.layout").attr("id", function(){return idNumber("No")+ $("div.tab_content div.layout").index(this)});
    $("ul.tab_label li").click(function(){
        var c = $("ul.tab_label li");
        var index = c.index(this);
        var p = idNumber("No");
        show(c,index,p);
   });
}
   
    function show(controltab_label,num,prefix){
       var tab_content= prefix + num;
       $('#'+tab_content).siblings().hide();
        $('#'+tab_content).show();
        controltab_label.eq(num).addClass("current").siblings().removeClass("current");
    }
 
    function idNumber(prefix){
        var idNum = prefix;
        return idNum;
    }
 