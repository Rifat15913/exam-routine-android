package io.diaryofrifat.code.examroutine.ui.selection.selectsubcategory

import io.diaryofrifat.code.examroutine.data.local.ExamType
import io.diaryofrifat.code.examroutine.ui.base.callback.MvpView

interface SelectSubcategoryMvpView : MvpView {
    fun onGettingExamTypes(list: List<ExamType>)
    fun onErrorGettingExamTypes(error: Throwable)
    fun onInternetConnectivity(isConnected: Boolean)
}