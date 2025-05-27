package com.example.comunicacaofragments;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextFragment extends Fragment {

    private SharedViewModel viewModel;

    public static TextFragment newInstance() {
        return new TextFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_text, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText edtMensagem = view.findViewById(R.id.edtMensagem);
        Button btnEnviar = view.findViewById(R.id.btnEnviar);

        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        btnEnviar.setOnClickListener(v -> {
            String texto = edtMensagem.getText().toString();
            viewModel.setMessage(texto);
        });

    }
}