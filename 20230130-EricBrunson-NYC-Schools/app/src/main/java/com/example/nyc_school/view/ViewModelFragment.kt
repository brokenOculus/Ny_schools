package com.example.nyc_school.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.nyc_school.viewmodel.SchoolViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
open class ViewModelFragment: Fragment() {
    protected val viewModel: SchoolViewModel by activityViewModels()
}