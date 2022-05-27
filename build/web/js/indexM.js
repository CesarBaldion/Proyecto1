

$(".detalles").click(function(e){
  
    
    e.preventDefault();
    alert("The paragraph was clicked.");
    alert(this.dataset.id)
    document.getElementById('nombreModal').value = this.dataset.id;
    $("#editProductModal").modal("show");
  
});