function fire(id, type, url, dataType, contentType) {
    console.log(id + type + url + dataType + contentType);
    alert(id);

    $.ajax({
        url: url,
        type: type,
        dataType: dataType,
        contentType: contentType,
        success: function(data) {
            console.log(data);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log(textStatus, errorThrown);
        }
    });
}