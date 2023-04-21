package com.example.laboratorio_05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Description_Fragment : Fragment() {
private lateinit var btnBack : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()
    }
                private fun bind(){
                    btnBack = view?.findViewById(R.id.btn_back) as Button
                }

                private fun listeners(){
                    btnBack.setOnClickListener{
                        it.findNavController().navigate(R.id.action_description_Fragment_to_billBoard_Fragment)
                    }
            }
    }