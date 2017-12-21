package modelo;

import java.util.HashMap;

public class NodoPerturbacionProgreso extends NodoPerturbacionEvaluable
{
    public NodoPerturbacionProgreso(NodoPerturbacionEvaluable base,
                                     HashMap<NodoPerturbacionEvaluable, NodoPerturbacionProgreso> hashmap)
    {
        
        this(base.getUserObject());
        hashmap.put(base, this);
        
        this.setEvaluado(base.isEvaluado());

        if (!base.esHoja())
            for (int i = 0; i < base.getChildCount(); i++)
            {
                this.add(new NodoPerturbacionProgreso((NodoPerturbacionEvaluable) base.getChildAt(i), hashmap));
            }
    }


    private NodoPerturbacionProgreso(Object object)
    {super(object);
     
    }

     @Override
    public String toString()
    {
        // TODO Implement this method


             return (this.getIdDato() + "\n" + this.getDato().getEtiquetaBean().toString());
    } 

    @Override
    public boolean isCero()
    {
        
        return false;
    }
}
