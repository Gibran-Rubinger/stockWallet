$(function(){
    $(#registration).validate({
        rules:{
            name:{
                required: true,
                name: true
            }

        }
    })
})
