package med.voll.api.controller;

import java.util.Objects;

public class TelefoneDTO {
        private final String ddd;
        private final String numero;

        public TelefoneDTO(String ddd, String numero) {
            this.ddd = ddd;
            this.numero = numero;
        }

        @Override
        public int hashCode() {
            return Objects.hash(ddd, numero);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } else if (!(obj instanceof TelefoneDTO)) {
                return false;
            } else {
                TelefoneDTO other = (TelefoneDTO) obj;
                return Objects.equals(ddd, other.ddd)
                        && Objects.equals(numero, other.numero);
            }
        }

        public String getDdd() {
            return this.ddd;
        }

        public String getNumero() {
            return this.numero;
        }

}
