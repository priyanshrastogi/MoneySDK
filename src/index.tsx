import {
  requireNativeComponent,
  UIManager,
  Platform,
  type ViewStyle,
} from 'react-native';

const LINKING_ERROR =
  `The package 'money-sdk' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

type MoneySDKProps = {
  color: string;
  style: ViewStyle;
};

const ComponentName = 'MoneySDKView';

export const MoneySDKView =
  UIManager.getViewManagerConfig(ComponentName) != null
    ? requireNativeComponent<MoneySDKProps>(ComponentName)
    : () => {
        throw new Error(LINKING_ERROR);
      };
