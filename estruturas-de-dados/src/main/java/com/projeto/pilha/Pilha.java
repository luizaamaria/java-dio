package com.projeto.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){//quando dá o psuh
        No refAuxiliar = refNoEntradaPilha;//eu guardo a ref. de topo
        refNoEntradaPilha = novoNo;// pego a ref. de topo e seto como novoNo, ou seja a nova ref. será pro nó que eu acabei de empilhar
        refNoEntradaPilha.setReNo(refAuxiliar);//e esse nó que eu terminei de empilhar ele se refere a ref. de prox. nó(que está embaixo dele setReNo) é a minha antiga ref. de topo refAuxiliar
    }

    public No pop(){
        if(!this.isEmpty()){ //se a pilha não estiver vazia
            No noPoped = refNoEntradaPilha;// eu guardo o nó que estou retirando
            refNoEntradaPilha = refNoEntradaPilha.getReNo();//referencia de entrada é o nó que está abaixo dele (getReNo)
            return noPoped;
        }
        return null;
    }

    public No top(){ //retorna o primeiro sem excluir
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){

//        if(reNoEntradaPilha == null{
//            return true;
//        }
//
//        return false;

        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "-------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "-------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            }else{
                break;
            }
        }
        stringRetorno += "============\n";
        return  stringRetorno;
    }
}
