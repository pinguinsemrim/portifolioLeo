# o codigo é assim
##  private void btnRmvActionPerformed(java.awt.event.ActionEvent evt) {                                       
##      String elemento = campoItem.getText();//Obter Texto
##      if(verificaSeExiste(elemento)==true){
##       lista.remove(elemento);// Remover da lista
##      campoItem.setText(null);//Limpar o campo de texto
##      exibeLista();
##      }else{
##         JOptionPane.showMessageDialog(this,"não tem esse elemento ainda");
##      }
