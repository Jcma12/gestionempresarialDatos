package quintob.ingredientes;

  public  class Pan{
      public static String clasico ="clasico";
      public static String integral="integral";
      public static String parmesano="parmesano";
        private String tamannio;
        private String tipoPan;
        public void setTipoPan (String tipoPan){
            this.tipoPan=tipoPan;
        }
        public String getTipoPan(){
            return this.tipoPan;
        }
    }

