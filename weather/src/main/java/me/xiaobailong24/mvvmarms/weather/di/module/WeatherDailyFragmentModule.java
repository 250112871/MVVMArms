package me.xiaobailong24.mvvmarms.weather.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.xiaobailong24.mvvmarms.di.scope.FragmentScope;
import me.xiaobailong24.mvvmarms.weather.mvvm.view.fragment.WeatherDailyFragment;

/**
 * @author xiaobailong24
 * @date 2017/8/14
 * Dagger WeatherDailyFragmentModule
 * 用于 Dagger.Android 依赖注入
 */
@Module
public abstract class WeatherDailyFragmentModule {
    /**
     * 第二种注入方式。当 Subcomponent 和 它的 Builder 没有其它方法或超类型时：
     * {@link me.xiaobailong24.mvvmarms.weather.di.component.WeatherActivitySubcomponent}
     * 可以不再需要 Subcomponent
     * <p>
     * 第一种{@link WeatherActivityModule}
     *
     * @return WeatherDailyFragment
     */
    @FragmentScope
    @ContributesAndroidInjector(
            //DataModule
            modules = {WeatherDailyModule.class, WeatherDailyViewModelModule.class})
    abstract WeatherDailyFragment contributeWeatherDailyFragment();
}
