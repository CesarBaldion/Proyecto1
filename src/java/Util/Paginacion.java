/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author cesar
 */
public class Paginacion {

    private Integer countSize;
    private Integer size;
    private Integer startSize;
    private Integer currentPage;
    private Integer countPage;
    private Integer cutPage;
    private Integer nextPage;
    
    public Paginacion(Integer countSize, Integer size, Integer startSize, Integer currentPage) {
        this.countSize = countSize;
        this.size = size;
        this.startSize = startSize;
        this.currentPage = currentPage;
        
        findCountPage();
        findStartSize();
        findCutPage();
        findNextPage();
        
    }

   
     private void findNextPage() {
         nextPage=currentPage==countPage?countPage:currentPage+1;
     }
     
    private void findCutPage() {
        cutPage=currentPage==1?1:currentPage-1;
    }
    
    private void findStartSize() {
        startSize=(currentPage-1)*size;
    }
    
     private void findCountPage() {
        countPage=countSize/size;
        if (countSize%size!=0){
        countPage=countPage+1; 
        }
    }

   

    

    
    
}
