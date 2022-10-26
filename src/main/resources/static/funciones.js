function eliminar(id) {
    swal({
        title: "¿Estas seguro?",
        text: "¡Una vez borrado el registro no podras recuperarlo!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
      })
      .then((OK) => {
        if (OK) {
            $.ajax({
                url:"/delete/"+id,
                success: function(res) {
                    console.log(res);
                }
            });
          swal("¡Poof!, regitro eliminado correctamente", {
            icon: "success",
          }).then((ok)=>{
              if (ok) {
                  location.href="/show";
              }
          });
        } else {
          swal("¡Excelente!, tu resgistro no ha sido eliminado");
        }
      });
}