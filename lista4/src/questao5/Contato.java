package questao5;

public class Contato {

	 protected float codigo = 0;
	 
	    public String nomeDaPessoa = "Não cadastrado";
	    public String endereco = "Não cadastrado";
	    private String e_mail = "Não cadastrado";
	    private int telefone= 0;
	    public String observacao = "Não cadastrado";
	    
	    // inicializa com os valores padroes todos os atributos
	    
	    public Contato(float codigo) {
	        this.setCodigo(codigo);;
	    }
	    
	    public Contato(float codigo, String nomeDaPessoa) {
	        this.setCodigo(codigo);
	        this.nomeDaPessoa = nomeDaPessoa;
	    }
	    
	    public Contato(float codigo, String nomeDaPessoa, String e_mail) {
	        this.setCodigo(codigo);
	        this.nomeDaPessoa = nomeDaPessoa;
	        this.e_mail = e_mail;
	    }
	    
	    public Contato(int telefone) {
	        this.setTelefone(telefone);
	    }
	    
	    // construtores 
	    
	    public void mostrarContato(){
	        // item D
	    	
	        System.out.println("O contato é: ");
	        System.out.println("O código e: " + this.codigo);
	        System.out.println("O nome e: " + this.nomeDaPessoa);
	        System.out.println("O e-mail e: " + this.e_mail);
	        System.out.println("O telefone e: " + this.telefone);
	        System.out.println("A observacao cadastrada e: " + this.observacao);
	    }
	    
	    public Contato duplicaContato(){
	        // item G
	    	
	        Contato novoContato = new Contato(this.getCodigo(), this.getNomeDaPessoa(), this.getE_mail());
	        novoContato.setTelefone(this.getTelefone());
	        novoContato.setEndereco(this.getEndereco());
	        novoContato.setObservacao(this.getObservacao());
	        return novoContato;
	    }
	    
	    public boolean estaPreenchido(){
	        // item H
	    	
	        String padrao = "Não cadastrado";
	        if (this.codigo == 0 || this.nomeDaPessoa == padrao || this.endereco == padrao || this.telefone == 0 || this.observacao == padrao){
	            return false;
	        }
	        else{
	            return true;
	        }
	    }
	    
	    public float getCodigo() {
	        return codigo;
	    }
	    
	    public void setCodigo(float codigo) {
	        if (codigo>=1000 && codigo<=9999) {
	            this.codigo = codigo;
	        }
	        else {
	            System.out.println("Nao foi possivel cadastrar o código: " + codigo);
	            System.out.println("Digite um valor válido!");
	        }
	    }
	    
	    public String getNomeDaPessoa() {
	        return nomeDaPessoa;
	    }
	    
	    public void setNomeDaPessoa(String nomeDaPessoa) {
	        this.nomeDaPessoa = nomeDaPessoa;
	    }
	    
	    public String getEndereco() {
	        return endereco;
	    }
	    
	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }
	    
	    public String getE_mail() {
	        return e_mail;
	    }
	    
	    public int getTelefone() {
	        return telefone;
	    }
	    public void setTelefone(int telefone) {
	        if (telefone<=99999999 && telefone>=11111111){
	            this.telefone = telefone;
	        }
	        else {
	            System.out.println("Valor de telefone invalido");
	        }
	    }
	    
	    public String getObservacao() {
	        return observacao;
	    }
	    
	    public void setObservacao(String observacao) {
	        this.observacao = observacao;
	    } 
	    
}
