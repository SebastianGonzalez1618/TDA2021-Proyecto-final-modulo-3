package com.example.tdaproyectofinalmodulo3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tdaproyectofinalmodulo3.R;
import com.example.tdaproyectofinalmodulo3.databinding.ItemDepartamentoBinding;
import com.example.tdaproyectofinalmodulo3.model.Departamento;
import com.example.tdaproyectofinalmodulo3.viewmodel.DepartamentoViewModel;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoAdapter extends RecyclerView.Adapter<DepartamentoAdapter.CustomViewHolder> {

    private List<Departamento> lista;
    private DepartamentoViewModel model;
    private OnClickListener listener;

    public DepartamentoAdapter(DepartamentoViewModel model) {
        lista = new ArrayList<>();
        this.model = model;
    }

    public void setLista(List<Departamento> lista) {
        this.lista = lista;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_departamento,parent,false);
        return new CustomViewHolder(view,listener);
    }

    public interface OnClickListener{
        void onClick(Departamento depa);
    }

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.bindData(lista.get(position));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        ItemDepartamentoBinding b;
        OnClickListener listener;

        public CustomViewHolder(@NonNull View itemView, OnClickListener listener) {
            super(itemView);
            b = ItemDepartamentoBinding.bind(itemView);
            this.listener = listener;
        }

        public void bindData(Departamento depa){

            b.tvProyecto.setText(depa.getNombreProyecto());
            b.tvDepartamento.setText(depa.getDepartamento());
            b.tvDireccion.setText(depa.getDireccionProyecto());

            itemView.setOnClickListener(v->{
                listener.onClick(depa);
            });
        }
    }
}
