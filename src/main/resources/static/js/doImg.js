function getSearchimg(){
    $.ajax({
        type: 'GET',
        url : "/view",
        data : $("form[name=search-form]").serialize(),
        success : function(result){
            //테이블 초기화
            $('#boardtable > tbody').empty();
            if(result.length>=1){
                result.forEach(function(item){
                    str='<tr>'
                    str += "<td>"+item.idx+"</td>";
                    str+="<td>"+item.writer+"</td>";
                    str+="<td><a href = '/board/detail?idx=" + item.idx + "'>" + item.title + "</a></td>";
                    str+="<td>"+item.date+"</td>";
                    str+="<td>"+item.hit+"</td>";
                    str+="</tr>"
                    $('#boardtable').append(str);
                })
            }
        }
    })
}