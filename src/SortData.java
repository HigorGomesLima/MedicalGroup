public class SortData extends SortConsulta{

    @Override
    protected boolean compare(Consulta a, Consulta b) {
        
        int diaA = Integer.parseInt(a.getInicio().substring(0,3));
        int mesA = Integer.parseInt(a.getInicio().substring(3,6));
        int anoA = Integer.parseInt(a.getInicio().substring(6,9));
        int horaA = Integer.parseInt(a.getInicio().substring(11,13));
        int minA = Integer.parseInt(a.getInicio().substring(14,16));
    }
    
}
