$(document).ready(function () {
    var prev=$("#prev");
    var next=$("#next");
    var list_img_list=$(".listimg img").length;
    var list_img_img=$("#list-img img");
    var list_img=$("#list-img");
    var a=0;
    var number=0;
    next.click(function () {
        if (a<list_img_list-1){
            number-=940;
            a+=1;
            list_img_img.css("left",number+"px");
        }else{
            list_img_img.css("left","0");
            a=0;
            number=0;
        }
    });
    prev.click(function () {
       if (a>0){
           number+=940;
            a-=1;
            list_img_img.css("left",number+"px");
       }else{
           number=-940*(list_img_list-1);
           list_img_img.css("left",number+"px");
           a=list_img_list-1;
           }
    });
});
