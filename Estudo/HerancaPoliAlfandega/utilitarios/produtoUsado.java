package HerancaPoliAlfandega.utilitarios;

import java.util.Date;

public class produtoUsado extends produto {
        private Date dataFabricacao;

        public produtoUsado() {
            super();
        }

        public produtoUsado(String nome, double preco, Date dataFabricacao) {
            super(nome, preco);
            this.dataFabricacao = dataFabricacao;
        }

        public Date getDataFabricacao() {
            return dataFabricacao;
        }

        public void setDataFabricacao(Date dataFabricacao) {
            this.dataFabricacao = dataFabricacao;
        }

        public String etiquetaPreco() {
            return getNome() + " (usado) $ " +
                    String.format("%.2f", getPreco()) +
                    " (Data de fabricação: " +
                    dataFabricacao + ")";
        }

    }
