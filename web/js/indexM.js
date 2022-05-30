

$(".detalles").click(function(e){
  
    
    e.preventDefault();
    alert(this.dataset.id)
    document.getElementById('nombreModal').value = this.dataset.id;
    $("#editProductModal").modal("show");
  
});
